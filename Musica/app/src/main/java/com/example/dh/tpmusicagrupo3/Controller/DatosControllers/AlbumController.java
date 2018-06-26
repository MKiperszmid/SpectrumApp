package com.example.dh.tpmusicagrupo3.Controller.DatosControllers;

import android.support.v4.app.Fragment;

import com.example.dh.tpmusicagrupo3.Model.POJO.Album;
import com.example.dh.tpmusicagrupo3.Model.POJO.Artist;
import com.example.dh.tpmusicagrupo3.View.Fragments.SongFragment;

import java.util.List;

public class AlbumController extends TypeController <Album> {

    public AlbumController(List<Album> albums){
        this.setData(albums);
    }

    @Override
    public Fragment getFragment() {
        return new SongFragment(); //TODO: Cambiar por AlbumFragment en un futuro.
    }
}