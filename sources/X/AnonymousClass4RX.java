package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper;
import com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1;
import com.whatsapp.util.Log;

/* renamed from: X.4RX  reason: invalid class name */
public final class AnonymousClass4RX {
    public AnonymousClass02n A00;
    public final Activity A01;
    public final AnonymousClass019 A02;
    public final AnonymousClass1KB A03;
    public final MemberSuggestedGroupsManager A04;
    public final AnonymousClass11C A05;
    public final C18030ve A06;
    public final CreateSubGroupSuggestionProtocolHelper A07;
    public final C18600wl A08;
    public final AnonymousClass1OX A09;
    public final Context A0A;

    public AnonymousClass4RX(Activity activity, Context context, AnonymousClass019 r4, AnonymousClass1KB r5, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass11C r7, C18030ve r8, CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, C18600wl r10, AnonymousClass1OX r11) {
        C18070vi.A0g(r8, 4, r5);
        C18070vi.A0x(r7, createSubGroupSuggestionProtocolHelper, memberSuggestedGroupsManager, r11, r10);
        this.A02 = r4;
        this.A0A = context;
        this.A01 = activity;
        this.A06 = r8;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = createSubGroupSuggestionProtocolHelper;
        this.A04 = memberSuggestedGroupsManager;
        this.A09 = r11;
        this.A08 = r10;
    }

    public final void A00(C005702m r12) {
        int i = r12.A00;
        if (i == -1) {
            Intent intent = r12.A01;
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("group_suggested");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("extra_group_name");
                    AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(bundleExtra.getString("extra_parent_group_jid"));
                    if (A022 == null || string == null) {
                        Log.e("SuggestGroupResultHandler/onResult/unexpected parent group or subject null");
                        return;
                    }
                    String string2 = bundleExtra.getString("extra_group_description");
                    Bundle bundle = bundleExtra.getBundle("extra_group_settings_bundle");
                    boolean z = bundleExtra.getBoolean("extra_is_hidden_subgroup_bundle", false);
                    AnonymousClass3MX.A1Q(new SuggestGroupResultHandler$onResult$1$1$1(bundle, this, A022, string, string2, (C30391dr) null, z), this.A09);
                    return;
                }
                return;
            }
            Context context = this.A0A;
            context.startActivity(AnonymousClass1LU.A02(context));
            this.A01.finish();
        } else if (i == 0) {
            Log.i("SuggestGroupResultHandler/Suggest group result canceled!");
        }
    }
}
