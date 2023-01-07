package com.example.chessgame;

public abstract class Tile {

    int tileCordinates;

    public Tile(int tileCordinates) {
        this.tileCordinates = tileCordinates;
    }

    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();


    // Ta subclassa definiuje puste pole szachownicy i jej zachowanie na szachownicy
    public static final class EmpyTile extends Tile{

        public EmpyTile(int tileCordinates) {
            super(tileCordinates);
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }


    // Ta subclassa definiuje zajete pole szachownicy i jej zachowanie na szachownicy
    public static final class OccupiedTile extends Tile {


        Piece pieceOnTile;


        // Zajeta szachownica musi uwzględniac
        // zarowno pole jak i kordynaty
        public OccupiedTile(int tileCordinates, Piece pieceOnTile) {

            // funkcja super ma tu za zadanie ustawic kordynaty
            super(tileCordinates);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }


}
