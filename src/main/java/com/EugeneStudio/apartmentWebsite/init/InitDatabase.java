package com.EugeneStudio.apartmentWebsite.init;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InitDatabase {

    private static class RoomTemp {
        private String continent;
        private String country;
        private String status;
        private String location;
        private String type;
        private int bed;
        private int bathroom;
        private int price;
        private String imageURL;

        public RoomTemp() {
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getBed() {
            return bed;
        }

        public void setBed(int bed) {
            this.bed = bed;
        }

        public int getBathroom() {
            return bathroom;
        }

        public void setBathroom(int bathroom) {
            this.bathroom = bathroom;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }
    }

    private static final String informationSource = "D:\\IdeaWorkSpace\\apartmentWebsite\\document\\information.txt";
    private static Connection connnection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apartment", "root", "liuyichen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private InitDatabase() {
    }

    public static void main(String[] args) {
        readFile();
    }

    private static void saveToDatabase(RoomTemp room) {
        String sql = "insert into room(continent,country,status,location,type,bed,bathroom,price,imageURL) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connnection.prepareStatement(sql);
            preparedStatement.setString(1, room.getContinent());
            preparedStatement.setString(2, room.getCountry());
            preparedStatement.setString(3, room.getStatus());
            preparedStatement.setString(4, room.getLocation());
            preparedStatement.setString(5, room.getType());
            preparedStatement.setInt(6, room.getBed());
            preparedStatement.setInt(7, room.getBathroom());
            preparedStatement.setInt(8, room.getPrice());
            preparedStatement.setString(9, room.getImageURL());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(informationSource)));
            bufferedReader.readLine();
            String readLine;
            int count = 0;
            RoomTemp room = new RoomTemp();
            while ((readLine = bufferedReader.readLine()) != null) {
                count++;
                switch (count) {
                    case 1:
                        room.setContinent(readLine);
                        break;
                    case 2:
                        room.setCountry(readLine);
                        break;
                    case 3:
                        room.setStatus(readLine);
                        break;
                    case 4:
                        room.setLocation(readLine);
                        break;
                    case 5:
                        room.setType(readLine);
                        break;
                    case 6:
                        room.setBed(Integer.parseInt(readLine));
                        break;
                    case 7:
                        room.setBathroom(Integer.parseInt(readLine));
                        break;
                    case 8:
                        room.setPrice(Integer.parseInt(readLine));
                        break;
                    case 9:
                        room.setImageURL(readLine);
                        saveToDatabase(room);
                        bufferedReader.readLine();
                        count = 0;
                }
            }
            connnection.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
