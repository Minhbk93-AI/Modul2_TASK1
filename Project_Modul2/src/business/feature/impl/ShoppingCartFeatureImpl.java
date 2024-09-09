package business.feature.impl;

import business.entity.ShoppingCart;
import business.feature.IShoppingCartFeature;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartFeatureImpl implements IShoppingCartFeature {
    public static List<ShoppingCart>shoppingCartsList= new ArrayList<>();
    @Override
    public void addOrUpdate(ShoppingCart shoppingCart) {
        int index = findIndexById(shoppingCart.getShoppingCartId());
        if (index == -1) {
            shoppingCartsList.add(shoppingCart);
        }else {
            shoppingCartsList.set(index, shoppingCart);
        }


    }

    @Override
    public void delete(Integer id) {
        shoppingCartsList.remove(findIndexById(id));

    }

    @Override
    public int findIndexById(Integer id) {
        return shoppingCartsList.stream().map(ShoppingCart::getShoppingCartId).toList().indexOf(id);
    }

    @Override
    public Integer getNewId() {
        return 0;
    }
}
