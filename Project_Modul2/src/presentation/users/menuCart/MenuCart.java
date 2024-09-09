package presentation.users.menuCart;

import business.color.Color;
import business.entity.Products;
import business.entity.ShoppingCart;
import business.feature.IShoppingCartFeature;
import business.feature.impl.ProductFeatureImpl;
import business.feature.impl.ShoppingCartFeatureImpl;

import java.util.Optional;
import java.util.Scanner;

public class MenuCart {
    IShoppingCartFeature shoppingCartFeature= new ShoppingCartFeatureImpl();
    public void menuCart(Scanner scanner){
        boolean isLoop= true;
        do {
            System.out.println(Color.BLUE + "┏━━━━━━━━━━━━━━━━━━━━━━━━━━ MENU CART ━━━━━━━━━━━━━━━━━━━━━━━━┓" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              1. Hiển thị danh sách giỏ hàng                      " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              2. Thêm mới sản phẩm vào giỏ hàng                   " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              3. Thay đổi số lượng sản phẩm trong giỏ hàng        " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              4. Xóa sản phẩm trong giỏ hàng                      " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              5. Xóa toàn bộ sản phẩm trong giỏ hàng              " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              6. Đặt hàng                                         " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┃" + Color.RESET + "              7. Quay lại                                         " + Color.BLUE + "┃" + Color.RESET);
            System.out.println(Color.BLUE + "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛" + Color.RESET);
            try {
                System.out.println("Nhập vào lựa chọn của bạn");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        showCartList();
                        break;

                    case 2:
                        addNewProductCart(scanner);
                        break;

                    case 3:

                        break;

                    case 4:
                        System.out.println("ab");
                        break;
                    case 6:
                        break;
                    case 7:
                        isLoop=false;
                        break;
                    default:
                        System.out.println("Vui lòng nhập lựa chọn từ 1 đến 7: ");

                }
            } catch (NumberFormatException e){
                System.out.println(Color.RED + "Bạn phải nhập lựa chọn là một số" + Color.RESET);

            }
        }while (isLoop);

}

    private void addNewProductCart(Scanner scanner) {
        // thêm sản phẩm vào giỏ hàng
        // { shoppingCartId , proId, userId, quantity }

        System.out.println("Nhập mã ID sản phẩm: ");
        try {
            int proId = Integer.parseInt(scanner.nextLine());
            // kiêm tra ton tai san pham
            Optional<Products> optionalProducts= ProductFeatureImpl.productList.stream().filter(p->p.getProductId()==proId).findFirst();
            if (optionalProducts.isPresent()){

                Optional<ShoppingCart> optionalShoppingCart= ShoppingCartFeatureImpl.shoppingCartsList.stream().filter(p->p.getProductId().getProductId()==proId).findFirst();
                if(optionalShoppingCart.isPresent()) {
                    System.out.println("");
                }
            }else {
//                shoppingCartFeature.addOrUpdate();

            }
        }catch (NumberFormatException e){
            System.out.println(Color.RED+"Nhập vào phải là một số "+Color.RESET);
        }
    }

    private void showCartList() {
        ShoppingCartFeatureImpl.shoppingCartsList.forEach(ShoppingCart::displayData);
    }
    }
