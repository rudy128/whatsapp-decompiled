package X;

import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Collection;

/* renamed from: X.3re  reason: invalid class name and case insensitive filesystem */
public final class C77883re extends C77913rm {
    public final C73623Wr A00;
    public final AnonymousClass3V2 A01;
    public final MentionableEntry A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C101215Bt(this));
    public final View A04;
    public final RecyclerView A05;
    public final AnonymousClass4DV A06 = AnonymousClass4DV.BOT_TYPEAHEAD;

    public C77883re(AnonymousClass1F9 r6, AnonymousClass3V2 r7, MentionableEntry mentionableEntry) {
        super(mentionableEntry.getContext(), (AttributeSet) null, 0);
        A04();
        this.A01 = r7;
        this.A02 = mentionableEntry;
        View inflate = View.inflate(getContext(), 2131626059, (ViewGroup) null);
        C18070vi.A0X(inflate);
        this.A04 = inflate;
        addView(inflate);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(inflate, 2131436480);
        this.A05 = recyclerView;
        C73623Wr r0 = new C73623Wr(r7);
        this.A00 = r0;
        recyclerView.setAdapter(r0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        AnonymousClass3MY.A1K(r6, AnonymousClass3V2.A00(r7), new C104995Qh(this), 13);
    }

    public double getAvailableScreenHeightPercentage() {
        return 0.8d;
    }

    private final int getTextRowHeight() {
        return C72453Mb.A0I(this.A03);
    }

    public boolean BEB() {
        return !((Collection) AnonymousClass3V2.A00(this.A01).A06()).isEmpty();
    }

    public void CMX() {
        C73623Wr r4 = this.A00;
        if (r4.A0Q() == 1 && r4.getItemViewType(0) == 1) {
            int A052 = A05(0);
            int width = this.A00.getWidth();
            if (width > A052) {
                width = A052;
            }
            RecyclerView recyclerView = this.A05;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width;
                layoutParams.height = width;
                recyclerView.setLayoutParams(layoutParams);
                A08(width, false);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        RecyclerView recyclerView2 = this.A05;
        ViewGroup.LayoutParams layoutParams2 = recyclerView2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            recyclerView2.setLayoutParams(layoutParams2);
            A07(r4.A0Q(), C72453Mb.A0I(this.A03));
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public View getContentView() {
        return this.A04;
    }

    public AnonymousClass4DV getType() {
        return this.A06;
    }

    public void Bcx(boolean z) {
        super.Bcx(z);
        AnonymousClass3V2 r2 = this.A01;
        r2.A00 = false;
        if (r2.A0V()) {
            r2.A0U((Editable) null, (UserJid) null);
            return;
        }
        C108725cC A0T = r2.A0T();
        if (A0T != null) {
            A0T.Bqz();
        }
    }
}
