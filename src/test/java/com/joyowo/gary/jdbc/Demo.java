package com.joyowo.gary.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * Created by jishu0425 on 2017/5/4.
 */
public class Demo {

    @Test
    public void test1() {
        Connection con;
        PreparedStatement ps;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joyowo", "root", "19930510");
            String sql = "select * from user WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 10);

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int num = 1;
            while (rs.next()) {
                System.out.println("第"+num++ +"组数据：");
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                    System.out.print(i + ":");
                    System.out.println(metaData.getColumnName(i) + "-" + rs.getObject(i));
                }
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
