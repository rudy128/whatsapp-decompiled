package com.whatsapp.unity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.C18070vi;
import java.util.Arrays;

public final class UnityTranslationResult {
    public final float confidence;
    public final int errorCode;
    public final String[] translation;

    public final String[] component1() {
        return this.translation;
    }

    public final float component2() {
        return this.confidence;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final UnityTranslationResult copy(String[] strArr, float f, int i) {
        return new UnityTranslationResult(strArr, f, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnityTranslationResult) {
                UnityTranslationResult unityTranslationResult = (UnityTranslationResult) obj;
                if (!(C18070vi.A18(this.translation, unityTranslationResult.translation) && Float.compare(this.confidence, unityTranslationResult.confidence) == 0 && this.errorCode == unityTranslationResult.errorCode)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String[] strArr = this.translation;
        return ((((strArr == null ? 0 : Arrays.hashCode(strArr)) * 31) + Float.floatToIntBits(this.confidence)) * 31) + this.errorCode;
    }

    public static /* synthetic */ UnityTranslationResult copy$default(UnityTranslationResult unityTranslationResult, String[] strArr, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strArr = unityTranslationResult.translation;
        }
        if ((i2 & 2) != 0) {
            f = unityTranslationResult.confidence;
        }
        if ((i2 & 4) != 0) {
            i = unityTranslationResult.errorCode;
        }
        return new UnityTranslationResult(strArr, f, i);
    }

    public UnityTranslationResult(String[] strArr, float f, int i) {
        this.translation = strArr;
        this.confidence = f;
        this.errorCode = i;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String[] getTranslation() {
        return this.translation;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnityTranslationResult(translation=");
        A10.append(Arrays.toString(this.translation));
        A10.append(", confidence=");
        A10.append(this.confidence);
        A10.append(", errorCode=");
        return AnonymousClass001.A1L(A10, this.errorCode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnityTranslationResult(String[] strArr, float f, int i, int i2, AnonymousClass1Y1 r6) {
        this(strArr, (i2 & 2) != 0 ? 0.0f : f, i);
    }
}
