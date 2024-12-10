package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.util.concurrent.Callable;

/* renamed from: X.11t  reason: invalid class name and case insensitive filesystem */
public interface C203411t extends C201511a {
    void BBX(AnonymousClass01E r1, AnonymousClass1EC r2, Integer num);

    WaDialogFragment BP0(AnonymousClass1EC r1);

    CommunityIntegrityDeactivatedDialogFragment BP1();

    WDSBottomSheetDialogFragment BP2(AnonymousClass1EC r1);

    void BhK(Context context, String str);

    void CAm(Context context, View view, GroupJid groupJid);

    void CAn(View view, Fragment fragment, GroupJid groupJid);

    void CAo(Context context, View view, GroupJid groupJid);

    void CAp(Context context, View view, AnonymousClass1EC r3);

    boolean CAq(Context context, View view, GroupJid groupJid);

    void CAr(Context context, View view, GroupJid groupJid);

    void CAs(View view, Fragment fragment, GroupJid groupJid);

    void CAt(Context context, AnonymousClass1BI r2, int i);

    void CAv(AnonymousClass1BI r1, AnonymousClass3KU r2, int i);

    void CLY(Context context, AnonymousClass1EC r2);

    void CMf(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass1EC r3, int i);

    void CNK(AnonymousClass1GP r1, AnonymousClass1EC r2, Callable callable);

    void CNu(Context context, int i, int i2);

    void CNv(Context context, AnonymousClass1EC r2, int i, int i2);

    void COG(Context context, AnonymousClass1EC r2);
}
