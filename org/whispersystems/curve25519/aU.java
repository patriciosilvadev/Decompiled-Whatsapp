package org.whispersystems.curve25519;

public class aU {
    public static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 0]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280)) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }

    public static void a(byte[] bArr) {
        int i = J.c;
        long b = 2097151 & (b(bArr, 47) >>> 2);
        long a = 2097151 & (a(bArr, 49) >>> 7);
        long a2 = 2097151 & (a(bArr, 52) >>> 4);
        long b2 = 2097151 & (b(bArr, 55) >>> 1);
        long a3 = 2097151 & (a(bArr, 57) >>> 6);
        long a4 = a(bArr, 60) >>> 3;
        long b3 = (2097151 & b(bArr, 42)) - (a4 * 683901);
        long a5 = (((2097151 & (a(bArr, 36) >>> 6)) - (997805 * a4)) + (136657 * a3)) - (b2 * 683901);
        long a6 = (((((2097151 & (a(bArr, 31) >>> 4)) + (470296 * a4)) + (654183 * a3)) - (997805 * b2)) + (136657 * a2)) - (a * 683901);
        long a7 = (2097151 & (a(bArr, 15) >>> 6)) + (666643 * b);
        long b4 = ((2097151 & (b(bArr, 18) >>> 3)) + (666643 * a)) + (470296 * b);
        long b5 = (((2097151 & b(bArr, 21)) + (666643 * a2)) + (470296 * a)) + (654183 * b);
        long a8 = ((((2097151 & (a(bArr, 23) >>> 5)) + (666643 * b2)) + (470296 * a2)) + (654183 * a)) - (997805 * b);
        long b6 = (((((2097151 & (b(bArr, 26) >>> 2)) + (666643 * a3)) + (470296 * b2)) + (654183 * a2)) - (997805 * a)) + (136657 * b);
        long a9 = ((((((2097151 & (a(bArr, 28) >>> 7)) + (666643 * a4)) + (470296 * a3)) + (654183 * b2)) - (997805 * a2)) + (136657 * a)) - (b * 683901);
        b = (1048576 + a7) >> 21;
        b4 += b;
        a7 -= b << 21;
        b = (1048576 + b5) >> 21;
        a8 += b;
        b5 -= b << 21;
        b = (1048576 + b6) >> 21;
        a9 += b;
        b6 -= b << 21;
        b = (1048576 + a6) >> 21;
        long b7 = (((((2097151 & (b(bArr, 34) >>> 1)) + (654183 * a4)) - (997805 * a3)) + (136657 * b2)) - (a2 * 683901)) + b;
        a6 -= b << 21;
        b = (1048576 + a5) >> 21;
        long b8 = (((2097151 & (b(bArr, 39) >>> 3)) + (136657 * a4)) - (a3 * 683901)) + b;
        a5 -= b << 21;
        b = (1048576 + b3) >> 21;
        long a10 = (2097151 & (a(bArr, 44) >>> 5)) + b;
        b3 -= b << 21;
        b = (1048576 + b4) >> 21;
        b5 += b;
        b4 -= b << 21;
        b = (1048576 + a8) >> 21;
        b6 += b;
        a8 -= b << 21;
        b = (1048576 + a9) >> 21;
        a6 += b;
        a9 -= b << 21;
        b = (1048576 + b7) >> 21;
        a5 += b;
        b7 -= b << 21;
        b = (1048576 + b8) >> 21;
        b3 += b;
        b8 -= b << 21;
        b6 -= a10 * 683901;
        b5 = ((b5 - (997805 * a10)) + (136657 * b3)) - (b8 * 683901);
        a7 = ((((a7 + (470296 * a10)) + (654183 * b3)) - (997805 * b8)) + (136657 * a5)) - (b7 * 683901);
        long b9 = (2097151 & b(bArr, 0)) + (666643 * a6);
        long b10 = (((2097151 & (b(bArr, 5) >>> 2)) + (666643 * a5)) + (470296 * b7)) + (654183 * a6);
        long a11 = (((((2097151 & (a(bArr, 10) >>> 4)) + (666643 * b3)) + (470296 * b8)) + (654183 * a5)) - (997805 * b7)) + (136657 * a6);
        b7 = (1048576 + b9) >> 21;
        long a12 = (((2097151 & (a(bArr, 2) >>> 5)) + (666643 * b7)) + (470296 * a6)) + b7;
        b9 -= b7 << 21;
        b7 = (1048576 + b10) >> 21;
        long a13 = (((((2097151 & (a(bArr, 7) >>> 7)) + (666643 * b8)) + (470296 * a5)) + (654183 * b7)) - (997805 * a6)) + b7;
        b10 -= b7 << 21;
        b7 = (1048576 + a11) >> 21;
        long b11 = (((((((2097151 & (b(bArr, 13) >>> 1)) + (666643 * a10)) + (470296 * b3)) + (654183 * b8)) - (997805 * a5)) + (136657 * b7)) - (a6 * 683901)) + b7;
        a11 -= b7 << 21;
        b7 = (1048576 + a7) >> 21;
        b4 = ((((b4 + (654183 * a10)) - (997805 * b3)) + (136657 * b8)) - (a5 * 683901)) + b7;
        a7 -= b7 << 21;
        b7 = (1048576 + b5) >> 21;
        a8 = ((a8 + (136657 * a10)) - (b3 * 683901)) + b7;
        b5 -= b7 << 21;
        b7 = (1048576 + b6) >> 21;
        a9 += b7;
        b6 -= b7 << 21;
        b7 = (1048576 + a12) >> 21;
        b10 += b7;
        a12 -= b7 << 21;
        b7 = (1048576 + a13) >> 21;
        a11 += b7;
        a13 -= b7 << 21;
        b7 = (1048576 + b11) >> 21;
        a7 += b7;
        b11 -= b7 << 21;
        b7 = (1048576 + b4) >> 21;
        b5 += b7;
        b4 -= b7 << 21;
        b7 = (1048576 + a8) >> 21;
        b6 += b7;
        a8 -= b7 << 21;
        b7 = (1048576 + a9) >> 21;
        a6 = 0 + b7;
        a9 -= b7 << 21;
        b9 += 666643 * a6;
        b7 = b9 >> 21;
        a12 = (a12 + (470296 * a6)) + b7;
        b9 -= b7 << 21;
        b7 = a12 >> 21;
        b10 = (b10 + (654183 * a6)) + b7;
        a12 -= b7 << 21;
        b7 = b10 >> 21;
        a13 = (a13 - (997805 * a6)) + b7;
        b10 -= b7 << 21;
        b7 = a13 >> 21;
        a11 = (a11 + (136657 * a6)) + b7;
        a13 -= b7 << 21;
        b7 = a11 >> 21;
        b11 = (b11 - (a6 * 683901)) + b7;
        a11 -= b7 << 21;
        b7 = b11 >> 21;
        a7 += b7;
        b11 -= b7 << 21;
        b7 = a7 >> 21;
        b4 += b7;
        a7 -= b7 << 21;
        b7 = b4 >> 21;
        b5 += b7;
        b4 -= b7 << 21;
        b7 = b5 >> 21;
        a8 += b7;
        b5 -= b7 << 21;
        b7 = a8 >> 21;
        b6 += b7;
        a8 -= b7 << 21;
        b7 = b6 >> 21;
        a9 += b7;
        b6 -= b7 << 21;
        b7 = a9 >> 21;
        a6 = 0 + b7;
        b9 += 666643 * a6;
        a12 += 470296 * a6;
        b10 += 654183 * a6;
        a13 -= 997805 * a6;
        b11 -= a6 * 683901;
        a6 = b9 >> 21;
        a12 += a6;
        b9 -= a6 << 21;
        a6 = a12 >> 21;
        b10 += a6;
        a12 -= a6 << 21;
        a6 = b10 >> 21;
        a13 += a6;
        b10 -= a6 << 21;
        a6 = a13 >> 21;
        a11 = (a11 + (136657 * a6)) + a6;
        a13 -= a6 << 21;
        a6 = a11 >> 21;
        b11 += a6;
        a11 -= a6 << 21;
        a6 = b11 >> 21;
        a7 += a6;
        b11 -= a6 << 21;
        a6 = a7 >> 21;
        b4 += a6;
        a7 -= a6 << 21;
        a6 = b4 >> 21;
        b5 += a6;
        b4 -= a6 << 21;
        a6 = b5 >> 21;
        a8 += a6;
        b5 -= a6 << 21;
        a6 = a8 >> 21;
        b6 += a6;
        a8 -= a6 << 21;
        a6 = b6 >> 21;
        a9 = (a9 - (b7 << 21)) + a6;
        b6 -= a6 << 21;
        bArr[0] = (byte) ((int) (b9 >> null));
        bArr[1] = (byte) ((int) (b9 >> 8));
        bArr[2] = (byte) ((int) ((b9 >> 16) | (a12 << 5)));
        bArr[3] = (byte) ((int) (a12 >> 3));
        bArr[4] = (byte) ((int) (a12 >> 11));
        bArr[5] = (byte) ((int) ((a12 >> 19) | (b10 << 2)));
        bArr[6] = (byte) ((int) (b10 >> 6));
        bArr[7] = (byte) ((int) ((b10 >> 14) | (a13 << 7)));
        bArr[8] = (byte) ((int) (a13 >> 1));
        bArr[9] = (byte) ((int) (a13 >> 9));
        bArr[10] = (byte) ((int) ((a13 >> 17) | (a11 << 4)));
        bArr[11] = (byte) ((int) (a11 >> 4));
        bArr[12] = (byte) ((int) (a11 >> 12));
        bArr[13] = (byte) ((int) ((a11 >> 20) | (b11 << 1)));
        bArr[14] = (byte) ((int) (b11 >> 7));
        bArr[15] = (byte) ((int) ((b11 >> 15) | (a7 << 6)));
        bArr[16] = (byte) ((int) (a7 >> 2));
        bArr[17] = (byte) ((int) (a7 >> 10));
        bArr[18] = (byte) ((int) ((a7 >> 18) | (b4 << 3)));
        bArr[19] = (byte) ((int) (b4 >> 5));
        bArr[20] = (byte) ((int) (b4 >> 13));
        bArr[21] = (byte) ((int) (b5 >> null));
        bArr[22] = (byte) ((int) (b5 >> 8));
        bArr[23] = (byte) ((int) ((b5 >> 16) | (a8 << 5)));
        bArr[24] = (byte) ((int) (a8 >> 3));
        bArr[25] = (byte) ((int) (a8 >> 11));
        bArr[26] = (byte) ((int) ((a8 >> 19) | (b6 << 2)));
        bArr[27] = (byte) ((int) (b6 >> 6));
        bArr[28] = (byte) ((int) ((b6 >> 14) | (a9 << 7)));
        bArr[29] = (byte) ((int) (a9 >> 1));
        bArr[30] = (byte) ((int) (a9 >> 9));
        bArr[31] = (byte) ((int) (a9 >> 17));
        if (Z.a) {
            J.c = i + 1;
        }
    }

    public static long a(byte[] bArr, int i) {
        return (((((long) bArr[i + 0]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280)) | ((((long) bArr[i + 2]) << 16) & 16711680)) | ((((long) bArr[i + 3]) << 24) & 4278190080L);
    }
}
