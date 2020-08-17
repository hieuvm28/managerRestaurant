/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDonCT;
import jdbcHelper.JdbcHelper;
import model.Statistical;

/**
 *
 * @author Admin
 */
public class DAO_HoaDonCT {

    public void insert(HoaDonCT model) {
        String sql = "insert into HoaDonChiTiet values (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaHoaDon(),
                model.getMaMon(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getGio());
    }

    public void update(HoaDonCT model){
        String sql = "update HoaDonChiTiet set SoLuong = ?, DonGia = ? where MaHD = ? and MaMon = ?";
        JdbcHelper.executeUpdate(sql, model.getSoLuong(),
                model.getDonGia(),
                model.getMaHoaDon(),
                model.getMaMon());
    }
    
    public void delete(int maHD, int maMon){
        String sql = "delete from HoaDonChiTiet where MaHD = ? and MaMon = ?";
        JdbcHelper.executeUpdate(sql, maHD, maMon);
    }
    
    public void deleteById(int maHD){
        String sql = "delete from HoaDonChiTiet where MaHD = ? ";
        JdbcHelper.executeUpdate(sql, maHD);
    }
    
    public void deleteAll(){
        String sql = "delete from HoaDonChiTiet";
        JdbcHelper.executeUpdate(sql);
    }
    
      public int sumBillHDbyMonth(int month){
        try {
            String sql = "select count(Distinct(HoaDonChiTiet.MaHD) ) from HoaDonChiTiet join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD where MONTH(NgayLap) = " + month;
            ResultSet rs = JdbcHelper.executeQuery(sql);
            int sum = 0;
            while(rs.next()){
            sum = rs.getInt(1);
            }
           return sum;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
   }
         public int sumBillHDbyDay(int day){
        try {
            String sql = "select count(Distinct(HoaDonChiTiet.MaHD) ) from HoaDonChiTiet join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD where DAY(NgayLap) = " + day;
            ResultSet rs = JdbcHelper.executeQuery(sql);
            int sum = 0;
            while(rs.next()){
            sum = rs.getInt(1);
            }
           return sum;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
   }
     public int sumBillHXbyMonth(int month){
        try {
            String sql = "select count(Distinct(HoaDonChiTiet.MaHX) ) from HoaDonChiTiet join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD where MONTH(NgayLap) = " + month;
            ResultSet rs = JdbcHelper.executeQuery(sql);
            int sum = 0;
            while (rs.next()) {                
                 sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
   }
    
     
   public int sumBillHD(){
        try {
            String sql = "select count(Distinct(MaHD)) from HoaDonChiTiet";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            int sum = 0;
            while(rs.next()){
            sum = rs.getInt(1);
            }
           return sum;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
   }
     public int sumBillHX(){
        try {
            String sql = "select count(Distinct(MaHX)) from HangXuat";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            int sum = 0;
            while (rs.next()) {                
                 sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
   }
    private HoaDonCT readFromResultSet(ResultSet rs) throws SQLException{
        HoaDonCT model = new HoaDonCT();
        model.setMaHoaDon(rs.getInt(1));
        model.setMaMon(rs.getInt(2));
        model.setSoLuong(rs.getShort(3));
        model.setDonGia(rs.getDouble(4));
        model.setGio(rs.getString(5));
        return model;
    }
}
