package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5fC  reason: invalid class name and case insensitive filesystem */
public class C110265fC extends BaseAdapter {
    public List A00 = AnonymousClass000.A13();
    public final /* synthetic */ C114635rQ A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public C110265fC(C114635rQ r2) {
        this.A01 = r2;
    }

    public static void A00(C110265fC r1, SelectionCheckView selectionCheckView, boolean z) {
        int i;
        C114635rQ r12 = r1.A01;
        if (r12.A0K) {
            i = 2131896333;
            if (z) {
                i = 2131896332;
            }
        } else {
            i = 2131896334;
            if (z) {
                i = 2131896335;
            }
        }
        AnonymousClass3MY.A0w(r12, selectionCheckView, i);
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.6gv, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C128936gv r0;
        AnonymousClass1E7 r7 = (AnonymousClass1E7) this.A00.get(i);
        if (view == null) {
            C114635rQ r2 = this.A01;
            view = r2.getLayoutInflater().inflate(2131626996, viewGroup, false);
            ? obj = new Object();
            view.setTag(obj);
            obj.A00 = AnonymousClass3MW.A0H(view, 2131429479);
            obj.A01 = C42141xh.A01(view, r2.A04, 2131429476);
            obj.A02 = (SelectionCheckView) view.findViewById(2131435130);
            C43421zm.A04(obj.A01.A01);
            r0 = obj;
        } else {
            r0 = (C128936gv) view.getTag();
        }
        view.setClickable(false);
        view.setLongClickable(false);
        Class<UserJid> cls = UserJid.class;
        Jid A06 = r7.A06(cls);
        C17960vV.A07(A06);
        r0.A03 = (UserJid) A06;
        C114635rQ r6 = this.A01;
        r6.A08.A07(r0.A00, r7);
        r0.A00.setImportantForAccessibility(2);
        r0.A01.A0A(r7, r6.A0H);
        boolean contains = r6.A0S.contains(r7.A06(cls));
        boolean z = r6.A0K;
        SelectionCheckView selectionCheckView = r0.A02;
        int i2 = 2131233083;
        if (z) {
            i2 = 2131232875;
        }
        selectionCheckView.setSelectionBackground(i2);
        if (r6.A0R.remove(r7.A06(cls))) {
            r0.A02.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass798(this, r0, 0, contains));
        } else {
            boolean A0P = AnonymousClass3MW.A0V(r6.A0B).A0P((UserJid) r7.A06(cls));
            SelectionCheckView selectionCheckView2 = r0.A02;
            if (A0P) {
                selectionCheckView2.A04(r6.A0K, false);
                AnonymousClass3MY.A0w(r6, r0.A02, 2131896778);
                view.setAlpha(0.5f);
                return view;
            }
            selectionCheckView2.A04(contains, false);
            A00(this, r0.A02, contains);
        }
        view.setAlpha(1.0f);
        return view;
    }
}
