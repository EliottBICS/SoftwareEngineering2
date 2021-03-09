package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
    	int cost = 0;
    	int booksStreak = 0;
    	boolean noMoreBooks = false;
    	while(noMoreBooks == false) {
    	for(int i = 0, i > books.length, i++) {
    		if(books[i] != 0) {
    			books[i] = books[i] -1;
    			booksStreak = booksStreak + 1;
    		}
    	}
    	if(booksStreak = 0) {
    		noMoreBooks = true;
    	}
    	else if(booksStreak = 1) {
    		cost = cost + 8;
    	}
    	else if(booksStreak = 2) {
    		cost = cost + 8 * 2 * 0.93;
    	}
    	else if(booksStreak = 3) {
    		cost = cost + 8 * 3 * 0.86;
    	}
    	else if(booksStreak = 4) {
    		cost = cost + 8 * 4 * 0.72;
    	}
    	else if(booksStreak = 5) {
    		cost = cost + 8 * 5 * 0.65;
    	}
    	}
        //TODO complete
    	//Takes the books and
        return cost;
        
    }
}



		
		