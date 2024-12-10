package X;

import com.facebook.common.time.RealtimeSinceBootClock;

public final class DAM implements C28573E8e {
    public Object A00;
    public final int A01;
    public final C25798CmA A02;
    public final C25786Clx A03;
    public final String A04;

    public DAM(C25798CmA cmA, C25786Clx clx, String str) {
        C18070vi.A0f(str, 1, cmA);
        this.A04 = str;
        this.A03 = clx;
        this.A02 = cmA;
        this.A01 = AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(clx, C17880vN.A03(str) * 31)) * 31;
        RealtimeSinceBootClock.A00.now();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        DAM dam = (DAM) obj;
        return C18070vi.A18(this.A04, dam.A04) && C18070vi.A18(this.A03, dam.A03) && C18070vi.A18(this.A02, dam.A02);
    }

    public String Bb4() {
        return this.A04;
    }

    public int hashCode() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BitmapMemoryCacheKey(sourceString=");
        A10.append(this.A04);
        AnonymousClass000.A1G(A10, ", resizeOptions=");
        A10.append(", rotationOptions=");
        A10.append(this.A03);
        A10.append(", imageDecodeOptions=");
        A10.append(this.A02);
        AnonymousClass000.A1G(A10, ", postprocessorCacheKey=");
        A10.append(", postprocessorName=");
        return C17900vP.A0B((String) null, A10);
    }
}
