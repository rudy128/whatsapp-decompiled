package X;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9yJ  reason: invalid class name and case insensitive filesystem */
public final class C198419yJ {
    public static final List A04 = C18070vi.A0M("Avatars2");
    public static final Collator A05;
    public static final List A06;
    public static final List A07 = C18070vi.A0M("ar_effects_cache");
    public static final List A08 = C18070vi.A0M("ar_effects_thumbnail_cache");
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C201811d.A00(49532);
    public final AnonymousClass00H A03;

    static {
        Collator instance = Collator.getInstance(Locale.ENGLISH);
        C18070vi.A0X(instance);
        A05 = instance;
        String[] strArr = new String[6];
        strArr[0] = "wa_effect_asset_disk_cache";
        strArr[1] = "wa_cask_ard_temp_store";
        AnonymousClass001.A1R("wa_face_tracking_asset_disk_cache", "wa_segmentation_asset_disk_cache", strArr);
        C72453Mb.A1T("wa_multi_model_asset_disk_cache", "wa_scripting_asset_disk_cache", strArr);
        List asList = Arrays.asList(strArr);
        C18070vi.A0X(asList);
        A06 = asList;
    }

    public C198419yJ(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }
}
