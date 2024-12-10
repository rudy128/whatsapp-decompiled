package X;

import android.graphics.Bitmap;

/* renamed from: X.848  reason: invalid class name */
public final class AnonymousClass848 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C138526xE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass848(C138526xE r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        Bitmap bitmap = (Bitmap) obj;
        C18070vi.A0d(bitmap, 0);
        this.this$0.A03.get();
        try {
            obj3 = AnonymousClass204.A03(bitmap);
            C18070vi.A0X(obj3);
            bitmap.recycle();
        } catch (Throwable th) {
            obj3 = C108945cZ.A1J(th);
        }
        if (!(obj3 instanceof AnonymousClass1IU)) {
            return obj3;
        }
        return bitmap;
    }
}
