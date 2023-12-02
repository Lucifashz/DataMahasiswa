/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.service;

import springHibernate.model.Mahasiswa;
import java.util.List;
/**
 *
 * @author achra
 */
public interface MahasiswaService {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(String npm);
    public List<Mahasiswa> getMahasiswas();
}
