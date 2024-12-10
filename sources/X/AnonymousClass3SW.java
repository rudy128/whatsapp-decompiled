package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3SW  reason: invalid class name */
public class AnonymousClass3SW extends C73093Oy implements C108775cH {
    public final Context A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C37451pZ A03;
    public final C88524a2 A04;
    public final C108875cR A05;
    public final AnonymousClass1W6 A06;
    public final AnonymousClass48j A07;

    public int getViewTypeCount() {
        return 125;
    }

    public View A05(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public AnonymousClass206 BTT(int i) {
        return BTU(this.A02, i);
    }

    public AnonymousClass206 BTU(Cursor cursor, int i) {
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A06.A01(cursor);
    }

    public int BTY(AnonymousClass206 r2, int i) {
        C88524a2 r0 = this.A04;
        C17960vV.A07(r2);
        return r0.A03(r2);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return BTU(this.A02, i);
    }

    public int getItemViewType(int i) {
        AnonymousClass206 BTU = BTU(this.A02, i);
        C88524a2 r0 = this.A04;
        C17960vV.A07(BTU);
        return r0.A03(BTU);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return BbW(view, viewGroup, BTU(this.A02, i), i);
    }

    public AnonymousClass3SW(Context context, AnonymousClass11S r2, AnonymousClass1M9 r3, C37451pZ r4, C88524a2 r5, C108875cR r6, AnonymousClass1W6 r7, AnonymousClass48j r8) {
        C73093Oy.A03(context, this);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
    }

    public View BbW(View view, ViewGroup viewGroup, AnonymousClass206 r8, int i) {
        AnonymousClass3uP r6;
        AnonymousClass1E7 A0H;
        C17960vV.A07(r8);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModifiedMessagesAdapter/getView message null, position=");
        A10.append(i);
        A10.append(", count=");
        C17960vV.A08(r8, C17880vN.A0t(A10, getCount()));
        if (view == null) {
            r6 = this.A04.A05(this.A05, r8);
        } else {
            getItemViewType(i);
            r6 = (AnonymousClass3uP) view;
            r6.A2V(r8, true);
        }
        ImageView A0H2 = AnonymousClass3MW.A0H(r6, 2131434167);
        if (A0H2 != null) {
            A0H2.setImportantForAccessibility(2);
        }
        boolean A0w = r8.A0w();
        AnonymousClass205 r0 = r8.A0v;
        if (A0w) {
            AnonymousClass1BI r4 = r0.A00;
            AnonymousClass1M9 r2 = this.A02;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("newsletter chatJid is null, message: ");
            A102.append(r8);
            A102.append(", isNewsletter: ");
            C17960vV.A08(r4, AnonymousClass3MY.A0r(A102, r8.A0w()));
            A0H = r2.A0H(r4);
        } else if (r0.A02) {
            A0H = AnonymousClass3MZ.A0Q(this.A01);
        } else {
            AnonymousClass1M9 r1 = this.A02;
            UserJid A0I = r8.A0I();
            C17960vV.A07(A0I);
            A0H = r1.A0H(A0I);
        }
        this.A03.A07(A0H2, A0H);
        r6.setOnClickListener(this.A07);
        if (r6 instanceof C108405be) {
            C108405be r12 = (C108405be) r6;
            if (r12.Be6()) {
                r12.CKk();
            }
        }
        return r6;
    }
}
