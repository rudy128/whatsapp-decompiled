package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8Hg  reason: invalid class name and case insensitive filesystem */
public class C161668Hg extends C38391rD {
    public final C18000vb A00;
    public final List A01;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C161968Il(AnonymousClass3MZ.A0D(viewGroup).inflate(2131624354, viewGroup, false), this);
        }
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        if (i != 1) {
            return new C162008Ip(A0D.inflate(2131624355, viewGroup, false), this);
        }
        return new AnonymousClass8IV(A0D.inflate(2131624353, viewGroup, false));
    }

    public int A0Q() {
        return this.A01.size();
    }

    public void Bmc(C42011xT r7, int i) {
        AnonymousClass78Q r2;
        View view;
        int i2 = r7.A01;
        boolean z = true;
        if (i2 == 0) {
            C161968Il r72 = (C161968Il) r7;
            C182959Wj r0 = (C182959Wj) this.A01.get(i);
            if (i == 0) {
                z = false;
            }
            r72.A01.setText(r0.A00);
            View view2 = r72.A00;
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        } else if (i2 == 1) {
            ((AnonymousClass8IV) r7).A00.setText(((C182959Wj) this.A01.get(i)).A00);
        } else if (i2 == 2) {
            C162008Ip r73 = (C162008Ip) r7;
            C168638jL r5 = (C168638jL) ((C182959Wj) this.A01.get(i));
            r73.A01.setText(r5.A00);
            WaTextView waTextView = r73.A02;
            String str = r5.A01;
            waTextView.setText(str);
            int i4 = r5.A00;
            if (i4 == 1) {
                C72463Mc.A0w(waTextView.getContext(), waTextView.getContext(), waTextView, 2130968892, 2131099967);
                r2 = new AnonymousClass78Q((Object) r73, (Object) r5, 29);
                view = waTextView;
            } else if (i4 == 2) {
                waTextView.setText(r73.A03.A00.A0G(AnonymousClass17K.A06(str)));
                View view3 = r73.A00;
                Context context = view3.getContext();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, (String) null));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    view3.setVisibility(0);
                    r2 = new AnonymousClass78Q(context, intent, 30);
                    view = view3;
                } else {
                    return;
                }
            } else {
                return;
            }
            view.setOnClickListener(r2);
        }
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        if (list.get(i) instanceof C168628jK) {
            return 0;
        }
        return C72453Mb.A04(list.get(i) instanceof C168618jJ ? 1 : 0);
    }

    public C161668Hg(C18000vb r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
