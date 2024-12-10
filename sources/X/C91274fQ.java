package X;

import android.content.Context;
import com.whatsapp.WaImageView;
import com.whatsapp.community.SubgroupWithParentView;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.4fQ  reason: invalid class name and case insensitive filesystem */
public class C91274fQ implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91274fQ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void accept(Object obj) {
        Object obj2;
        String str;
        String str2;
        int i = this.A00;
        Object obj3 = this.A01;
        if (i != 0) {
            AnonymousClass1GV r3 = (AnonymousClass1GV) this.A02;
            C18070vi.A0j(r3, obj);
            Iterator it = ((AnonymousClass4S6) obj3).A03.A05().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C18070vi.A18(((C25550Cho) obj2).A01, obj)) {
                    break;
                }
            }
            C25550Cho cho = (C25550Cho) obj2;
            if (cho == null || (str2 = cho.A01) == null || (str = C25351CeA.A01(Locale.forLanguageTag(str2))) == null) {
                str = "";
            }
            r3.accept(str);
            return;
        }
        SubgroupWithParentView subgroupWithParentView = (SubgroupWithParentView) obj3;
        C37451pZ r2 = (C37451pZ) this.A02;
        AnonymousClass1E7 r6 = (AnonymousClass1E7) obj;
        WaImageView waImageView = subgroupWithParentView.A01;
        int i2 = subgroupWithParentView.A00;
        if (r6 == null) {
            AnonymousClass1VU r32 = subgroupWithParentView.A05;
            Context context = subgroupWithParentView.getContext();
            C65482wZ A0J = AnonymousClass3Ma.A0J();
            C72473Md.A0t(context.getTheme(), context.getResources(), waImageView, A0J, r32);
            return;
        }
        r2.A08(waImageView, r6, -2.14748365E9f, i2);
    }
}
