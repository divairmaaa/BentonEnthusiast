package com.example.bentonenthusiast;

class RowItem {
    private int imageid;
    private String nama;
    private String harga;

    public RowItem(int imageid, String nama, String harga){
        this.imageid=imageid;
        this.nama=nama;
        this.harga=harga;
    }
    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String toString(){
        return nama + "\n" + harga;
    }

}
