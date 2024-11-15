package com.example.tarearecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorContacto  extends RecyclerView.Adapter <AdaptadorContacto.ContactoViewHolder> {

    ArrayList <Contacto> agenda;

    public AdaptadorContacto(ArrayList<Contacto> agenda) {
        this.agenda = agenda;
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AdaptadorContacto.ContactoViewHolder contactoViewHolder =
                new ContactoViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.ficha_contacto,parent,false)
                );
        return contactoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position) {
        Contacto contacto = agenda.get(position);
        holder.imageView.setImageResource(contacto.getFotoContacto());
        holder.tv_nombre.setText(contacto.getNombre());
        holder.tv_apellidos.setText(contacto.getApellidos());
        holder.tv_correo.setText(contacto.getEmail());
        holder.tv_telefono.setText(contacto.getTelefono());
    }

    @Override
    public int getItemCount() {
        return agenda.size();
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tv_nombre;
        TextView tv_apellidos;
        TextView tv_correo;
        TextView tv_telefono;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_fotoContacto);
            tv_nombre = itemView.findViewById(R.id.tv_nombre);
            tv_apellidos = itemView.findViewById(R.id.tv_apellidos);
            tv_correo = itemView.findViewById(R.id.tv_correo);
            tv_telefono = itemView.findViewById(R.id.tv_telefono);
        }

    }

}
