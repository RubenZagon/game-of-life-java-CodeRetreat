package game;

public class Cell {
    private Integer positionX;
    private Integer positionY;
    private Integer status;

    private Cell(Integer positionX, Integer positionY, Integer status) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.status = status;
    }


    public static Cell createCell(Integer positionX, Integer positionY, Integer status) {
        if (status != 0 || status != 1) {
            throw new RuntimeException("No se ha puesto un número válido");
        }



        return new Cell(positionX, positionY, status);
    }
}
