package com.goit.module6;

public class TexturePoolTest {
    public static void main(String[] args) {
        //TexturePool texturePool=new TexturePool();
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
        System.out.println(TexturePool.getInstance() == TexturePool.getInstance());
    }
}
class TexturePool{
    private static final TexturePool instance =new TexturePool();

    public static TexturePool getInstance(){

        return instance;
    }

    private TexturePool() {
    }

    public String getTexture(String textureName){

        return "Get texture "+textureName;
    }


}
