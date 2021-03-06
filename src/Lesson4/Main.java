package Lesson4;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        /*
        Client[] Clients = {
            new Fizik(5468723, "Смирнов Игорь Сергеевич", 1992, "муж", 5347512),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Fizik(4245735, "Смирнова Татьяна Сергеевна", 1990, "жен", 7567457),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Fizik(4576952, "Нога Степан Иванович", 1968, "муж", 4564564),
            new Fizik(1257654, "Ольговна Ольга Сергеевич", 1929, "жен", 4564544),
            new Fizik(4576544, "Спина Олег Олегович", 1975, "муж", 5785754),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Fizik(9687574, "Игнатов Артем Артемович", 1984, "муж", 4645644),
            new Fizik(8545424, "Степановна Маша Сергеевич", 2001, "жен", 2752724),
            new Fizik(2525455, "Смирнова Лена Сергеевич", 2012, "жен", 7567117),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Fizik(4565754, "Монитор Колено Сергеевич", 1976, "муж", 5767175),
            new Fizik(454145, "Смирнов Игорь Сергеевич", 1953, "жен", 4564554),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Urik(5648344, "OOO Time", 4563215,4598),
            new Urik(5648344, "OOO Time", 4563215,4598),
        };

         */

        IClientGenerator generatorFizik = new FizikClientGenerator();
        IClientGenerator generatorUrik = new UrikClientGenerator();

        Client[] clients = new Client[20];
        for (int i = 0; i < clients.length; i++) {
            if (i % 2 == 0) {
                clients[i] = generatorFizik.getRandomClient();
            }
            else clients[i] = generatorUrik.getRandomClient();
        }


        //Кривой вывод для контроля заполнения массива (глазам больно видеть обрезанный результат, но через дебаг видно, что заполнение происходит нормально=)
        System.out.println("Все клиенты:");
        System.out.println(Arrays.toString(clients));
        System.out.println();




        //x = количество физиков
        int x = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] instanceof Fizik) {
                if (((Fizik) clients[i]).gender.equals("муж"))
                    x++;
            }
        }

        //Новый массив из физиков
        Fizik[] strongFizik = new Fizik[x];
        int y = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] instanceof Fizik) {
                if (((Fizik) clients[i]).gender.equals("муж")) {
                    strongFizik[y] = (Fizik) clients[i];
                    y++;
                }
            }
        }

        //Сортировка физиков мужиков
        Arrays.sort(strongFizik, Edit.YearSort);


        //вывод физика
        System.out.println("Клиенты мужчины отсортированные по возрасту:");
        Edit.printArray(strongFizik);

    }
}


