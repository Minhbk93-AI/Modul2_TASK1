package presentation.admin.menuUser;

import business.color.Color;
import business.entity.Users;
import business.feature.impl.UserFeatureImpl;

import java.util.List;
import java.util.Scanner;

public class MenuUserManager {
    public void menuUserManger(Scanner sc) {
        boolean isLoop= true;
        do {
            System.out.println(Color.BLUE + "================== MENU USER =================" + Color.RESET);
            System.out.println("          1. HIỂN THỊ NGƯỜI DÙNG                 ");
            System.out.println("          2. SỬA THAY ĐỔI TRẠNG THÁI             ");
            System.out.println("          3. XÓA NGƯỜI DÙNG                      ");
            System.out.println("          4. TÌM KIẾM NGƯỜI DÙNG                 ");
            System.out.println("          5. SẮP XÊP TĂNG DẦN THEO TÊN          ");
            System.out.println("          6. QUAY LẠI                            ");
            System.out.println(Color.BLUE + "===============================================" + Color.RESET);
            try {
                System.out.println("Nhập vào lựa chọn của bạn");
                int choice= Integer.parseInt(sc.nextLine()) ;
                switch (choice)   {
                    case 1:
                        displayUser();
                        break;
                    case 2:
                        editStatusUser();
                        break;
                    case 3:
                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                    case 6:
                        isLoop=false;
                        break;
                    default:
                        System.err.println("Nhập vào lựa chọn từ 1-6");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập vào lựa chọn phải là một số");
            }

        }while (isLoop);
    }

    private void editStatusUser() {

    }

    private void displayUser() {
        UserFeatureImpl.usersList.stream().forEach(Users::displayData);

    }
}


