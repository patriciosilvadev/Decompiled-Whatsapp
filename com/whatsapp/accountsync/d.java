package com.whatsapp.accountsync;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class d {
    private static final String[] z;
    final long a;
    final String b;

    static {
        String[] strArr = new String[2];
        String str = "0[ xU";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 16;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "yUt";
                    obj = null;
            }
        }
    }

    public d(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public String toString() {
        return z[1] + this.a + z[0] + this.b;
    }
}
