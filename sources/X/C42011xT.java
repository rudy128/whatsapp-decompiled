package X;

import android.util.Log;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
public abstract class C42011xT {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = 0;
    public long A07 = -1;
    public C37931qQ A08 = null;
    public C42011xT A09 = null;
    public C42011xT A0A = null;
    public RecyclerView A0B;
    public WeakReference A0C;
    public List A0D = null;
    public List A0E = null;
    public boolean A0F = false;
    public int A0G = 0;
    public final View A0H;

    public void A07() {
        this.A00 = 0;
        this.A04 = -1;
        this.A02 = -1;
        this.A07 = -1;
        this.A05 = -1;
        this.A0G = 0;
        this.A09 = null;
        this.A0A = null;
        List list = this.A0D;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A06 = 0;
        this.A03 = -1;
        RecyclerView.A0D(this);
    }

    public final void A09(boolean z) {
        int i;
        int i2;
        int i3 = this.A0G;
        if (z) {
            i = i3 - 1;
        } else {
            i = i3 + 1;
        }
        this.A0G = i;
        if (i < 0) {
            this.A0G = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
            return;
        }
        if (!z) {
            if (i == 1) {
                i2 = this.A00 | 16;
            } else {
                return;
            }
        } else if (i == 0) {
            i2 = this.A00 & -17;
        } else {
            return;
        }
        this.A00 = i2;
    }

    public final int A05() {
        RecyclerView recyclerView = this.A0B;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A0K(this);
    }

    public List A06() {
        List list;
        if ((this.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 || (list = this.A0D) == null || list.size() == 0) {
            return A0I;
        }
        return this.A0E;
    }

    public void A08(int i, boolean z) {
        if (this.A02 == -1) {
            this.A02 = this.A04;
        }
        int i2 = this.A05;
        if (i2 == -1) {
            i2 = this.A04;
            this.A05 = i2;
        }
        if (z) {
            this.A05 = i2 + i;
        }
        this.A04 += i;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            ((C38491rN) view.getLayoutParams()).A01 = true;
        }
    }

    public boolean A0A() {
        if ((this.A00 & 128) != 0) {
            return true;
        }
        return false;
    }

    public C42011xT(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public String toString() {
        String simpleName;
        String str;
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" position=");
        sb.append(this.A04);
        sb.append(" id=");
        sb.append(this.A07);
        sb.append(", oldPos=");
        sb.append(this.A02);
        sb.append(", pLpos:");
        sb.append(this.A05);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (this.A08 != null) {
            sb2.append(" scrap ");
            if (this.A0F) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        int i = this.A00;
        if ((i & 4) != 0) {
            sb2.append(" invalid");
        }
        if ((i & 1) == 0) {
            sb2.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb2.append(" update");
        }
        if ((i & 8) != 0) {
            sb2.append(" removed");
        }
        if (A0A()) {
            sb2.append(" ignored");
        }
        if ((i & 256) != 0) {
            sb2.append(" tmpDetached");
        }
        if ((i & 16) != 0 || this.A0H.hasTransientState()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" not recyclable(");
            sb3.append(this.A0G);
            sb3.append(")");
            sb2.append(sb3.toString());
        }
        int i2 = this.A00;
        if (!((i2 & 512) == 0 && (i2 & 4) == 0)) {
            sb2.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
