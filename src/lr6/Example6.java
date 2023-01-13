package lr6;

public class Example6 {
    public static void main(String[] args) {
        int[] inArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Второй аргумент метода меньше длины массива");
        for (int i = 0; i < Task1.SetArray(inArray, 10).length; i++) {
            System.out.println("outArray[" + i + "] = " + Task1.SetArray(inArray, 10)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Task1.SetArray(inArray, 25);
        Task1.viewArray();
    }


    protected static class Task1 {
        private static int[] outArray;
        //статический метод, которому аргументом передается целочисленный массив и целое число.
        private static int[] SetArray(int[] inArray, int count) {

            if (count > inArray.length) {
                count = inArray.length;
            }
            outArray = new int[count];
            System.arraycopy(inArray, 0, outArray, 0, count);
            //метод возвращает ссылку на новый массив
            return outArray;
        }

        private static void viewArray()
        {
            for (int i = 0; i < Task1.outArray.length; i++) {
                System.out.println("outArray[" + i + "] = " + outArray[i]);
            }
        }
    }
}
//Напишите программу со статическим методом, которому аргументом передается
//целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//массив, который получается из исходного массива (переданного первым аргументом
//методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//аргумент метода больше длины массива, переданного первым аргументом, то методом
//создается копия исходного массива и возвращается ссылка на эту копию