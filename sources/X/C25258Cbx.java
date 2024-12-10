package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.wearable.datax.LocalChannel;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cbx  reason: case insensitive filesystem */
public final class C25258Cbx {
    public Context A00;
    public LocalChannel A01 = null;
    public LocalChannel A02 = null;
    public CL7 A03;
    public C22871BTf A04 = null;
    public CZ7 A05 = null;
    public Integer A06;
    public ByteBuffer A07;
    public ByteBuffer A08;
    public Map A09;
    public CompletableFuture A0A = null;
    public AtomicBoolean A0B;
    public AtomicInteger A0C;
    public C18090vk A0D;
    public AnonymousClass1OB A0E;
    public final Map A0F;

    public /* synthetic */ C25258Cbx(Context context) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        HashMap A11 = C17880vN.A11();
        C27892DnT dnT = C27892DnT.A00;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(88064);
        C18070vi.A0X(allocateDirect);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        C18070vi.A0X(allocateDirect2);
        HashMap A112 = C17880vN.A11();
        AtomicBoolean A0w = C108965cb.A0w();
        CL7 cl7 = new CL7();
        Integer num = AnonymousClass00R.A0C;
        this.A00 = context;
        this.A0C = atomicInteger;
        this.A0F = A11;
        this.A0D = dnT;
        this.A08 = allocateDirect;
        this.A07 = allocateDirect2;
        this.A09 = A112;
        this.A0E = null;
        this.A0B = A0w;
        this.A03 = cl7;
        this.A06 = num;
    }

    public final void A02() {
        this.A0C = new AtomicInteger(1);
        this.A0F.clear();
        LocalChannel localChannel = this.A01;
        if (localChannel != null) {
            CCR.A00(localChannel);
        }
        CZ7 cz7 = this.A05;
        if (cz7 != null) {
            cz7.A00();
        }
        LocalChannel localChannel2 = this.A02;
        if (localChannel2 != null) {
            CCR.A00(localChannel2);
        }
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A0A = null;
        this.A0D = C27893DnU.A00;
        this.A08.clear();
        this.A07.clear();
        this.A0E = null;
        this.A0B.set(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 <= 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            int r2 = r0.get()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L_0x000f
            int r1 = r2 + 1
            if (r2 > 0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x0000
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25258Cbx.A00():int");
    }

    public final CompletableFuture A01() {
        return this.A0A;
    }

    public final void A03(CompletableFuture completableFuture) {
        this.A0A = completableFuture;
    }
}
