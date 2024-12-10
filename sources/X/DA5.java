package X;

import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

public class DA5 implements E43 {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity A01;

    public DA5(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A01 = groupChatLiveLocationsActivity;
        View A09 = AnonymousClass3MX.A09(groupChatLiveLocationsActivity.getLayoutInflater(), (ViewGroup) null, 2131625877);
        this.A00 = A09;
        A09.setLayoutDirection(3);
    }

    public View BSt(BPT bpt) {
        int A002;
        C63312sr A05;
        C60072nL r10 = ((C139086yC) bpt.A0F).A02;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A01;
        C72043Kk r1 = groupChatLiveLocationsActivity.A08;
        View view = this.A00;
        C42141xh A012 = C42141xh.A01(view, r1, 2131432909);
        TextView A0E = C17880vN.A0E(view, 2131433436);
        View findViewById = view.findViewById(2131431626);
        AnonymousClass11S r0 = groupChatLiveLocationsActivity.A02;
        UserJid userJid = r10.A06;
        if (r0.A0O(userJid)) {
            A012.A01.setTextColor(AnonymousClass3Ma.A00(groupChatLiveLocationsActivity, 2130970352, 2131101326));
            A012.A02();
            findViewById.setVisibility(8);
        } else {
            AnonymousClass1BI r12 = groupChatLiveLocationsActivity.A0N.A0I;
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A003 = C42941yz.A00(r12);
            if (A003 == null || (A05 = groupChatLiveLocationsActivity.A0J.A05(A003, userJid)) == null) {
                A002 = AnonymousClass3Ma.A00(groupChatLiveLocationsActivity, 2130970353, 2131101327);
            } else {
                A002 = C84024Ho.A00(groupChatLiveLocationsActivity, A05);
            }
            A012.A01.setTextColor(A002);
            A012.A07(groupChatLiveLocationsActivity.A0C.A0H(userJid), -1);
            findViewById.setVisibility(0);
        }
        C43421zm.A04(A012.A01);
        int i = r10.A03;
        String str = "";
        if (i != -1) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            str = AnonymousClass000.A0y(groupChatLiveLocationsActivity.A00.A0K(A1a, 2131755221, (long) i), A11);
        }
        if (!TextUtils.isEmpty(str)) {
            A0E.setText(str);
            A0E.setVisibility(0);
            return view;
        }
        A0E.setVisibility(8);
        return view;
    }
}
