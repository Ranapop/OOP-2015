package com.example.roxanappop.chess.Model.Pieces;

import com.example.roxanappop.chess.Model.Board.Board;
import com.example.roxanappop.chess.Model.OffsetList;
import com.example.roxanappop.chess.Model.Position;

import java.util.ArrayList;

/**
 * Created by roxanappop on 12/9/2015.
 */
public class Bishop extends Piece {


    public Bishop(int image, Position position,int colour){
        super(image,position,colour);
    }

    @Override
    protected int[][] getStepsForOffsetList() {
        int steps[][] = {{-1,-1},{-1,1},{1,-1},{1,1}};
        return steps;
    }

    @Override
    public boolean canAttack(Board board,Position positionToBeAttacked){
        if(super.getPosition().getWidthDistance(positionToBeAttacked)==super.getPosition().getHeightDistance(positionToBeAttacked)){
            return super.canAttack(board,positionToBeAttacked);
        }
        return false;
    }

}
