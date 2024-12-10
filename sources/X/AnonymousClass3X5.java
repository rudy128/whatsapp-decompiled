package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;

/* renamed from: X.3X5  reason: invalid class name */
public final class AnonymousClass3X5 extends C38391rD {
    public Cursor A00;
    public Map A01 = AnonymousClass1D7.A0I();
    public final AnonymousClass4JD A02;
    public final C37451pZ A03;
    public final C88524a2 A04;
    public final C108875cR A05;
    public final AnonymousClass1W6 A06;
    public final AnonymousClass48j A07;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        if (i == -1) {
            View A0E = AnonymousClass3MY.A0E(A0D, viewGroup, 2131624916);
            C18070vi.A0d(A0E, 1);
            return new C42011xT(A0E);
        }
        View inflate = A0D.inflate(2131626721, viewGroup, false);
        AnonymousClass4JD r1 = this.A02;
        C18070vi.A0b(inflate);
        C37451pZ r6 = this.A03;
        C88524a2 r7 = this.A04;
        C108875cR r8 = this.A05;
        AnonymousClass48j r10 = this.A07;
        List list = C42011xT.A0I;
        AnonymousClass10E r0 = r1.A00.A01;
        return new AnonymousClass3vI(inflate, AnonymousClass10E.A17(r0), AnonymousClass10E.A4z(r0), r6, r7, r8, AnonymousClass3MY.A0Z(r0), r10);
    }

    public int A0Q() {
        int count;
        Cursor cursor = this.A00;
        if (cursor == null || (count = cursor.getCount()) == 0) {
            return 0;
        }
        return count + 1;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        String str;
        AnonymousClass1E7 A0E;
        C73803Xj r102 = (C73803Xj) r10;
        C18070vi.A0d(r102, 0);
        if (r102 instanceof AnonymousClass3vI) {
            Cursor cursor = this.A00;
            C17960vV.A07(cursor);
            C18070vi.A0X(cursor);
            cursor.moveToPosition(i - 1);
            AnonymousClass206 A012 = this.A06.A01(cursor);
            C17960vV.A07(A012);
            C18070vi.A0X(A012);
            AnonymousClass3vI r103 = (AnonymousClass3vI) r102;
            Map map = this.A01;
            C691536c A002 = C60492o7.A00(A012);
            if (A002 == null || (str = A002.A02.A01) == null) {
                str = A012.A0v.A01;
            }
            C18070vi.A0b(str);
            AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass000.A13();
            }
            int size = abstractCollection.size();
            AnonymousClass3uP r4 = r103.A00;
            if (r4 == null) {
                r4 = r103.A06.A05(r103.A07, A012);
                r4.setRecipientNameVisibility(false);
            } else {
                r4.A2V(A012, true);
            }
            ImageView A0H = AnonymousClass3MW.A0H(r4, 2131434167);
            A0H.setImportantForAccessibility(2);
            if (A012.A0v.A02) {
                AnonymousClass11S r0 = r103.A02;
                r0.A0I();
                A0E = r0.A0D;
            } else {
                UserJid A0I = A012.A0I();
                if (A0I != null) {
                    A0E = r103.A04.A0E(A0I);
                } else {
                    throw AnonymousClass000.A0s("senderUserJid can't be null since it is a groupJid");
                }
            }
            if (A0E != null) {
                r103.A05.A07(A0H, A0E);
                r4.setOnClickListener(r103.A08);
                if (r4 instanceof C108405be) {
                    C108405be r1 = (C108405be) r4;
                    if (r1.Be6()) {
                        r1.CKk();
                    }
                }
                if (r103.A00 == null) {
                    r103.A01.addView(r4);
                    r103.A00 = r4;
                }
                WaTextView waTextView = r103.A03;
                C90074dU.A01(waTextView, r103, abstractCollection, 47);
                Context context = r103.A01.getContext();
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = AnonymousClass1EG.A03(context, AnonymousClass1YL.A00(context, 2130968583, 2131099679));
                C17880vN.A1T(A1b, size, 1);
                AnonymousClass3MY.A1X(context.getResources().getQuantityString(2131755357, size, AnonymousClass1EG.A0K(A1b)), waTextView);
                return;
            }
            throw AnonymousClass000.A0s("sender can't be null");
        }
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return -1;
        }
        C88524a2 r2 = this.A04;
        Cursor cursor = this.A00;
        C17960vV.A07(cursor);
        C18070vi.A0X(cursor);
        cursor.moveToPosition(i - 1);
        AnonymousClass206 A012 = this.A06.A01(cursor);
        C17960vV.A07(A012);
        C18070vi.A0X(A012);
        return r2.A03(A012);
    }

    public AnonymousClass3X5(AnonymousClass4JD r2, C37451pZ r3, C88524a2 r4, C108875cR r5, AnonymousClass1W6 r6, AnonymousClass48j r7) {
        C18070vi.A0j(r6, r2);
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
    }
}
