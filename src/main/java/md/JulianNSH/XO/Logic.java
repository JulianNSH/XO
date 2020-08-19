package md.JulianNSH.XO;

public class Logic {
    private final Figure[][] table;

    public Logic(Figure[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        for (int row =0; row<this.table.length; row++){
            result = true;

            for (int cell = 0; cell<this.table.length-1; cell++){
                if(!(this.table[row][cell].hasMarkX() && this.table[row][cell+1].hasMarkX())){
                    result = false;
                    break;
                }
            }
            if(result){
                break;
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        return true;
    }
}
