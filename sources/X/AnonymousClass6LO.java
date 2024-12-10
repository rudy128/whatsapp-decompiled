package X;

import android.graphics.Bitmap;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6LO  reason: invalid class name */
public class AnonymousClass6LO extends A34 {
    public final /* synthetic */ CallGridViewModel A00;

    public AnonymousClass6LO(CallGridViewModel callGridViewModel) {
        this.A00 = callGridViewModel;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z = false;
        for (C134216qE r6 : ((C134216qE[][]) objArr)[0]) {
            if (C108945cZ.A1T(this)) {
                break;
            }
            CallGridViewModel callGridViewModel = this.A00;
            C128326fo r7 = callGridViewModel.A0X;
            UserJid userJid = r6.A0A;
            C18070vi.A0d(userJid, 0);
            C18100vl r8 = r7.A02;
            if (((Set) AnonymousClass3MX.A14(r8)).contains(userJid)) {
                Bitmap A06 = callGridViewModel.A0W.A06(r6);
                if (A06 != null) {
                    int width = A06.getWidth() / 40;
                    int i = 8;
                    if (width >= 8) {
                        i = Math.min(width, 16);
                    }
                    FilterUtils.A02(i, A06);
                } else {
                    Log.i("voip/CallGridViewModel/cacheLastFrame no bitmap");
                }
                if (((Set) AnonymousClass3MX.A14(r8)).contains(userJid)) {
                    if (A06 != null) {
                        r7.A00.put(userJid, A06);
                        r7.A01.remove(userJid);
                        z = true;
                    } else {
                        r7.A01.add(userJid);
                        r7.A00.remove(userJid);
                    }
                }
                boolean z2 = z;
                z = false;
                if (!z2) {
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap;
        Boolean bool = (Boolean) obj;
        if (!C108945cZ.A1T(this) && bool.booleanValue()) {
            CallGridViewModel callGridViewModel = this.A00;
            LinkedHashMap linkedHashMap = callGridViewModel.A18;
            Iterator A0i = C17890vO.A0i(linkedHashMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                C1404971r r3 = new C1404971r((AnonymousClass70A) A16.getValue());
                Object key = A16.getKey();
                A16.getValue();
                C128326fo r1 = callGridViewModel.A0X;
                C18070vi.A0d(key, 0);
                if (((Set) AnonymousClass3MX.A14(r1.A02)).contains(key)) {
                    bitmap = (Bitmap) r1.A00.get(key);
                } else {
                    bitmap = null;
                }
                r3.A08 = bitmap;
                linkedHashMap.put(A16.getKey(), r3.A01());
            }
            CallGridViewModel.A0F(callGridViewModel);
        }
    }
}
