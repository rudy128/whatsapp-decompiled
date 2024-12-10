package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.ListItemWithLeftIcon;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.1gi  reason: invalid class name and case insensitive filesystem */
public final class C32141gi implements C32131gh {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public C32141gi(AnonymousClass118 r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A00 = r2;
        this.A03 = r4;
        this.A01 = r3;
        this.A04 = r5;
        this.A02 = r6;
    }

    public static final LinkedHashMap A00(C32141gi r5) {
        C18030ve r52 = r5.A01;
        C18040vf r4 = C18040vf.A02;
        return AnonymousClass1D7.A0C(new AnonymousClass1D6("is_nux_update_enabled", Boolean.valueOf(C18020vd.A05(r4, r52, 10379))), new AnonymousClass1D6("is_nux_filter_enabled", Boolean.valueOf(C18020vd.A05(r4, r52, 10388))), new AnonymousClass1D6("is_smb", false));
    }

    public static final void A01(AnonymousClass1FU r2, ListItemWithLeftIcon listItemWithLeftIcon, C32141gi r4) {
        if (listItemWithLeftIcon != null) {
            listItemWithLeftIcon.setIcon(2131233267);
            AnonymousClass118 r1 = r4.A00;
            listItemWithLeftIcon.setTitle((CharSequence) r1.A01(2131898309));
            listItemWithLeftIcon.setDescription((CharSequence) r1.A01(2131898308));
            listItemWithLeftIcon.setOnClickListener(new AnonymousClass78M(r4, r2, 28));
        }
    }

    public void CAw(boolean z) {
        Intent A1T;
        LinkedHashMap A002 = A00(this);
        A002.put("is_bottom_sheet", Boolean.valueOf(z));
        String obj = new JSONObject(C200610r.A04(new AnonymousClass1D6("server_params", A002))).toString();
        C18070vi.A0X(obj);
        this.A03.get();
        Context context = this.A00.A00;
        if (z) {
            A1T = new Intent();
            A1T.setClassName(context, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity");
            A1T.putExtra("screen_name", "com.bloks.www.whatsapp.ai.biz.learn_more");
            A1T.putExtra("screen_params", obj);
            A1T.putExtra("is_async_component", false);
        } else {
            A1T = AnonymousClass1LU.A1T(context, "com.bloks.www.whatsapp.ai.biz.learn_more", obj);
        }
        C18070vi.A0b(A1T);
        A1T.setFlags(268435456);
        context.startActivity(A1T);
    }
}
