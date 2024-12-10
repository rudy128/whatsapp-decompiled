package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass8AP;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements AnonymousClass8AP {
    public float A00;
    public int[] A01;

    public long BMZ() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
            if (Float.compare(emojiPicker$EmojiWeight.A00, this.A00) != 0 || !Arrays.equals(this.A01, emojiPicker$EmojiWeight.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean BFJ(Object obj) {
        return Arrays.equals(this.A01, (int[]) obj);
    }

    public int hashCode() {
        return (AnonymousClass000.A0L(Float.valueOf(this.A00)) * 31) + Arrays.hashCode(this.A01);
    }

    public /* bridge */ /* synthetic */ Object BSD() {
        return this.A01;
    }

    public float Bbo() {
        return this.A00;
    }

    public void CLT(float f) {
        this.A00 = f;
    }
}
