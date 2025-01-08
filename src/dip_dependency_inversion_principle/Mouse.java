package src.dip_dependency_inversion_principle;

public class Mouse implements Device{
    @Override
    public void use() {
        System.out.println("Movendo o cursor do mouse...");
    }
}
