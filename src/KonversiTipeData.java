public class KonversiTipeDataa {
    public static void main(String[] args) {
        //widening
        byte TipeDataByte = 10;
        short TipeDataShort = TipeDataByte;
        int TipeDataInt = TipeDataShort;
        long TipeDataLong = TipeDataInt;
        float TipeDataFloat = TipeDataLong;
        double TipeDataDouble = TipeDataFloat;

        //narrowing
        int TipeDataInteger = 127;
        byte TipeDataByte2 = (byte) TipeDataInteger;

        System.out.println(TipeDataByte2);
    }
}