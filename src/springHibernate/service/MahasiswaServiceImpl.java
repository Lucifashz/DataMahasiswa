package springHibernate.service;

import springHibernate.dao.MahasiswaDao;
import springHibernate.model.Mahasiswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("MahasiswaService")
@Transactional(readOnly = true)
public class MahasiswaServiceImpl implements MahasiswaService{
    @Autowired
    private MahasiswaDao mahasiswaDao;

    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa){
        mahasiswaDao.save(mahasiswa); 
    }

    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa){
        mahasiswaDao.update(mahasiswa); 
    }

    @Transactional
    @Override
    public void delete(Mahasiswa mahasiswa){
        mahasiswaDao.delete(mahasiswa); 
    }

    @Transactional
    @Override
    public Mahasiswa getMahasiswa(String npm){
        return mahasiswaDao.getMahasiswa(npm);
    }

    @Override
    public List<Mahasiswa> getMahasiswas(){
        return mahasiswaDao.getMahasiswas();
    }
}
