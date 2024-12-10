package X;

/* renamed from: X.1yU  reason: invalid class name and case insensitive filesystem */
public abstract class C42631yU {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final String A0A;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        String str = C42641yV.A00;
        sb.append(str);
        sb.append(" FROM ");
        sb.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb.append(" WHERE ");
        sb.append("wa_contacts.jid LIKE ?");
        A05 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(str);
        sb2.append(" FROM ");
        sb2.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb2.append(" WHERE ");
        sb2.append("wa_contacts.number = ?");
        A07 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        sb3.append(str);
        sb3.append(" FROM ");
        sb3.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb3.append(" WHERE ");
        sb3.append("wa_contacts.jid = ?");
        A04 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("SELECT ");
        sb4.append(str);
        sb4.append(" FROM ");
        sb4.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb4.append(" WHERE ");
        sb4.append("wa_contacts.jid IN (?,?)");
        A06 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT ");
        sb5.append(str);
        sb5.append(" FROM ");
        sb5.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb5.append(" WHERE ");
        sb5.append("wa_contacts._id = ?");
        A08 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("SELECT ");
        sb6.append(str);
        sb6.append(" FROM ");
        sb6.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb6.append(" WHERE ");
        sb6.append("raw_contact_id = ? AND number = ?");
        A09 = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("SELECT ");
        sb7.append(str);
        sb7.append(" FROM ");
        sb7.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb7.append(" WHERE ");
        sb7.append("wa_contacts.jid LIKE '%@g.us'");
        sb7.append(" OR ");
        sb7.append("wa_contacts.jid LIKE '%@temp'");
        A01 = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("SELECT ");
        sb8.append(str);
        sb8.append(" FROM ");
        sb8.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb8.append(" WHERE ");
        sb8.append("is_whatsapp_user = 1");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid != 'broadcast'");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid NOT LIKE '%@broadcast'");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid NOT LIKE '%@g.us'");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid NOT LIKE '%@temp'");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid NOT LIKE '%@newsletter'");
        sb8.append(" AND ");
        sb8.append("wa_contacts.jid != ?");
        A02 = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("SELECT ");
        sb9.append(str);
        sb9.append(" FROM ");
        sb9.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        A00 = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("SELECT ");
        sb10.append(str);
        sb10.append(" FROM ");
        sb10.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb10.append(" WHERE ");
        sb10.append("wa_contacts.sync_policy = 1");
        A03 = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append("SELECT ");
        sb11.append(str);
        sb11.append(" FROM ");
        sb11.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb11.append(" WHERE ");
        sb11.append("is_whatsapp_user = 1");
        sb11.append(" AND ");
        sb11.append("wa_contacts.sync_policy = 1");
        A0A = sb11.toString();
    }

    public static String A00(boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        if (z2) {
            str = "wa_contacts.jid";
        } else {
            str = C42641yV.A00;
        }
        sb.append(str);
        sb.append(" FROM ");
        sb.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
        sb.append(" WHERE ");
        sb.append("is_whatsapp_user = 1");
        sb.append(" AND ");
        sb.append("wa_contacts.jid != 'broadcast'");
        sb.append(" AND ");
        sb.append("wa_contacts.jid IS NOT NULL");
        sb.append(" AND ");
        sb.append("wa_contacts.jid NOT LIKE '%@broadcast'");
        sb.append(" AND ");
        sb.append("wa_contacts.jid NOT LIKE '%@g.us'");
        sb.append(" AND ");
        sb.append("wa_contacts.jid NOT LIKE '%@temp'");
        sb.append(" AND ");
        sb.append("wa_contacts.jid != ?");
        sb.append(" AND ");
        sb.append("wa_contacts.jid != ?");
        sb.append(" AND (");
        sb.append("wa_contacts.raw_contact_id IS NULL OR (wa_contacts.raw_contact_id < 0");
        sb.append(" AND ");
        sb.append("wa_contacts.raw_contact_id != -5");
        sb.append("))");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append(obj);
            str2 = " AND (wa_contacts.is_sidelist_synced = 1)";
        } else {
            sb2.append(obj);
            str2 = " AND (wa_contacts.is_sidelist_synced = 0 OR wa_contacts.is_sidelist_synced IS NULL)";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
