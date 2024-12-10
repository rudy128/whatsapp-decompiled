package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import X.C17890vO;
import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.fontStyle);
        AnonymousClass000.A1M(objArr, this.textColor);
        AnonymousClass3Ma.A1S(objArr, this.backgroundColor);
        objArr[3] = this.thumbnail;
        return Arrays.deepHashCode(objArr);
    }

    public boolean equals(Object obj) {
        int length;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextData textData = (TextData) obj;
        if (this.fontStyle != textData.fontStyle || this.textColor != textData.textColor || this.backgroundColor != textData.backgroundColor) {
            return false;
        }
        byte[] bArr = this.thumbnail;
        byte[] bArr2 = textData.thumbnail;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null) {
            length = bArr2.length;
        } else if (bArr2 != null) {
            return Arrays.equals(bArr, bArr2);
        } else {
            length = bArr.length;
        }
        if (length != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextData; fontStyle=");
        A10.append(this.fontStyle);
        A10.append("; textColor=");
        A10.append(this.textColor);
        A10.append("; backgroundColor=");
        A10.append(this.backgroundColor);
        A10.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        return C17890vO.A0V(valueOf, A10);
    }
}
