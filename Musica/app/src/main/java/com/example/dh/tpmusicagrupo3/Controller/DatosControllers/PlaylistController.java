package com.example.dh.tpmusicagrupo3.Controller.DatosControllers;

import android.support.v4.app.Fragment;

import com.example.dh.tpmusicagrupo3.Model.POJO.Playlist;
import com.example.dh.tpmusicagrupo3.Model.POJO.Track;
import com.example.dh.tpmusicagrupo3.View.Fragments.Detalles.PlaylistFragment;
import com.example.dh.tpmusicagrupo3.View.Fragments.SongFragment;

import java.util.List;

public class PlaylistController extends TypeController<Playlist> {

    public PlaylistController(Playlist data) {
        super(data);
    }

    @Override
    public Fragment getFragment() {
        return new PlaylistFragment();
    }
}
