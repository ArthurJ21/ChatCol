package com.chatcol.chat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chat.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class HolderMensaje extends RecyclerView.ViewHolder {

    private TextView nombre;
    private TextView mensaje;
    private TextView hora;
    private CircleImageView fotoperfil;
    private ImageView fotomensaje;

    public HolderMensaje(@NonNull View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.nombremensaje);
        mensaje = (TextView) itemView.findViewById(R.id.mensajeMensaje);
        hora = (TextView) itemView.findViewById(R.id.horamensaje);
        fotoperfil = (CircleImageView) itemView.findViewById(R.id.fotoperfilmensaje);
        fotomensaje = (ImageView) itemView.findViewById(R.id.mensajefoto);
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getMensaje() {
        return mensaje;
    }

    public void setMensaje(TextView mensaje) {
        this.mensaje = mensaje;
    }

    public TextView getHora() {
        return hora;
    }

    public void setHora(TextView hora) {
        this.hora = hora;
    }

    public CircleImageView getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(CircleImageView fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    public ImageView getFotomensaje() {
        return fotomensaje;
    }

    public void setFotomensaje(ImageView fotomensaje) {
        this.fotomensaje = fotomensaje;
    }
}
