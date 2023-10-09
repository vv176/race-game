package islandgame.game;

public interface Connection {

   int  getStartIsland();

   int  getEndIsland();

   boolean canTraverse(Car car);

   void traverse(Car car);

   boolean canTraverse(Boat boat);

   void traverse(Boat boat);


}

