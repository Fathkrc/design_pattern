package StructurallDP.FacedeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text="Content";//şifrelenmesini istediğimiz text
        AESEncryptor aesEncryptor=new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor=new MD5Encryptor();
        md5Encryptor.encrypt(text,"SecretKey");

        SHAEncryptor shaEncryptor=new SHAEncryptor();
        shaEncryptor.encrypt(text,"SecretKey",true);

        System.out.println("***********************");
        EncryptorFacade encryptorFacade=new EncryptorFacade();
        encryptorFacade.encrypt(text,EncryptorFacade.EncType.SHA);

    }
}
