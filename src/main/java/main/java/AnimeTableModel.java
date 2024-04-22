/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gonzalo
 */
public class AnimeTableModel extends AbstractTableModel {

    //int id, String title, String genre, Date launchDate, String studios, String summary, Double rating, Blob animeImage, Boolean fav, Boolean pend
    private List<Anime> animeList;
    private String[] columns = {"id", "Título", "Géneros", "Fecha lanzamiento", "Estudio", "Puntuación", "Portada"};

    public AnimeTableModel(List<Anime> animeList) {
        this.animeList = animeList;
    }

    @Override
    public int getRowCount() {
        return animeList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return animeList.get(rowIndex).getIdAnime();
            case 1:
                return animeList.get(rowIndex).getTitle();
            case 2:
                return animeList.get(rowIndex).getGenre();
            case 3:
                return animeList.get(rowIndex).getLaunchDate();
            case 4:
                return animeList.get(rowIndex).getStudios();
            case 5:
                return animeList.get(rowIndex).getRating();
            case 6:
                return animeList.get(rowIndex).getAnimeImage();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void add(Anime anime, int rowIndex) {
        animeList.add(rowIndex, anime);
        fireTableRowsInserted(rowIndex, rowIndex);
    }

}
