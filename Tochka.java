package tochka;

public class Tochka {
    int x;
    int y;
    public Tochka(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //попадает ли точка в окружность или на её края
    public boolean okruzh(int r)
    {
        boolean popal = false;
        if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2))
            return popal = true;
        return popal;
    }

    //расстояние от точки до точки
    public double dlina(Tochka t2)
    {
        int dlx = Math.abs(x - t2.x); //катет по х**2
        int dly = Math.abs(y - t2.y); //катет по y**2
        double dl = Math.sqrt(Math.pow(dlx, 2) + Math.pow(dly, 2));
        return dl;
    }

    //в какой четверти находится точка
    public int chet()
    {
        int ch = 0;
        if(x >= 0 && y >= 0)
            ch = 1;
        if(x < 0 && y >= 0)
            ch = 2;
        if(x < 0 && y < 0)
            ch = 3;
        if(x >= 0 && y < 0)
            ch = 4;
        return ch;
    }
}
