package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2xT  reason: invalid class name and case insensitive filesystem */
public final class C66012xT implements AnonymousClass191 {
    public final AnonymousClass00H A00;

    public C66012xT(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        C24001Il r4 = (C24001Il) this.A00.get();
        if (r4.A06()) {
            Context context = r4.A03;
            String packageName = context.getPackageName();
            C18070vi.A0X(packageName);
            Set A03 = AnonymousClass1AP.A03("com.whatsapp.HomeActivity", "com.whatsapp.Conversation", "com.whatsapp.home.ui.HomePlaceholderActivity");
            if (AnonymousClass000.A1Y(r4.A05.getValue())) {
                A03.add("com.whatsapp.chatinfo.ContactInfoActivity");
                A03.add("com.whatsapp.group.GroupChatInfoActivity");
                A03.add("com.whatsapp.chatinfo.ListChatInfoActivity");
                A03.add("com.whatsapp.newsletter.NewsletterInfoActivity");
                A03.add("com.whatsapp.gallery.MediaGalleryActivity");
            }
            if (AnonymousClass000.A1Y(r4.A07.getValue())) {
                A03.add("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                A03.add("com.whatsapp.home.ui.StarredMessagesPlaceholderActivity");
            }
            A03.add("com.whatsapp.conversation.selection.SingleSelectedMessageActivity");
            A03.add("com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity");
            HashSet A12 = C17880vN.A12();
            try {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(packageName, 1).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!A03.contains(activityInfo.name)) {
                            A12.add(new ComponentName(packageName, activityInfo.name));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SplitWindowManager/getActivitiesToExpand/ failed to get activities from the packagemanager", e);
            }
            ArrayList A0D = C29351c6.A0D(A12);
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                A0D.add(new C25129CZc((ComponentName) it.next()));
            }
            ((CUv) r4.A08.getValue()).A00(new C22726BMn(C29431cG.A12(A0D)));
        }
    }

    public void Ba9() {
    }
}
