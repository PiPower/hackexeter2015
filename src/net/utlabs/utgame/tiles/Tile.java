package net.utlabs.utgame.tiles;

/**
 * Created by mas.dicicco on 2/28/2015
 * Abstract representation of all tiles which can exist in a room 
 */
public abstract class Tile {


    /**
     * Assigns tiles integer values so we don't have to initialize like a thousand of them 
     */
    public Tile[] tiles = new Tile[] {
            new TileWall(0), new TileHazard(1), new TileTurret(2)
    };

    /**
     * ID of the tile 
     */
    public final int mId;

    /**
     * Constructs a Tile*
     * @param id: ID number for a hazard
     */
    public Tile(int id){
        mId=id;        
    }
    
    /**
     * Updates
     * @param meta: Metadata for the tile
     * @param x: x coordinate
     * @param y: y coordinate
     * @param room: The room the tile is in
     */
    public abstract void update(int meta, int x, int y, Room room, Player player);

    /**
     * Draws
     * @param meta: metadata for the tile
     * @param x: x coordinate
     * @param y: y coordinate
     * @param room: The room the tile is in
     */
    public abstract void draw(int meta, int x, int y, Room room, Player player);
}
