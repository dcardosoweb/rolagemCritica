package br.com.dcardoso.rolagemcritica.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

public class Utilitarios {


    public static Spanned converteHtmlToSpanned(String textoHtml)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
             return Html.fromHtml(textoHtml, Html.FROM_HTML_MODE_COMPACT);
        } else {
            return  Html.fromHtml(textoHtml);
        }
    }
}
