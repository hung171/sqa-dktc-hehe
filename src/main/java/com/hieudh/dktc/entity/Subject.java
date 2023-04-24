package com.hieudh.dktc.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_mon_hoc")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "id_seq", sequenceName = "item_id_seq", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    private int id;
    @Column(name = "ma_mon")
    private String maMon;
    @Column(name = "ten")
    private String ten;
    @Column(name = "nhom")
    private int nhom;

    @Column(name = "to_thuc_hanh")
    private int toThucHanh;

    @Column(name = "so_tin_chi")
    private int soTinChi;
    @Column(name = "so_tin_chi_hp")
    private int soTinChiHP;
    @Column(name = "ma_lop")
    private String maLop;
    @Column(name = "si_so")
    private int siSo;
    @Column(name = "con_lai")
    private int conLai;

    @ManyToMany(mappedBy = "subjects")
    private Set<User> users;

    public Subject() {
    }

    public Subject(int id, String maMon, String ten, int nhom, int toThucHanh, int soTinChi, int soTinChiHP, String maLop, int siSo, int conLai, Set<User> users) {
        this.id = id;
        this.maMon = maMon;
        this.ten = ten;
        this.nhom = nhom;
        this.toThucHanh = toThucHanh;
        this.soTinChi = soTinChi;
        this.soTinChiHP = soTinChiHP;
        this.maLop = maLop;
        this.siSo = siSo;
        this.conLai = conLai;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public int getToThucHanh() {
        return toThucHanh;
    }

    public void setToThucHanh(int toThucHanh) {
        this.toThucHanh = toThucHanh;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getSoTinChiHP() {
        return soTinChiHP;
    }

    public void setSoTinChiHP(int soTinChiHP) {
        this.soTinChiHP = soTinChiHP;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public int getConLai() {
        return conLai;
    }

    public void setConLai(int conLai) {
        this.conLai = conLai;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", maMon='" + maMon + '\'' +
                ", ten='" + ten + '\'' +
                ", nhom=" + nhom +
                ", toThucHanh=" + toThucHanh +
                ", soTinChi=" + soTinChi +
                ", soTinChiHP=" + soTinChiHP +
                ", maLop='" + maLop + '\'' +
                ", siSo=" + siSo +
                ", conLai=" + conLai +
                ", users=" + users +
                '}';
    }
}