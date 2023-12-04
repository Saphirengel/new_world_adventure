package com.example.newworldadventure.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.newworldadventure.R
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.databinding.KompendiumScreenFloraFaunaBinding
import com.example.newworldadventure.databinding.KompendiumScreenMaterialienBinding
import com.example.newworldadventure.databinding.KompendiumScreenWaffenRuestungSchmuckBinding
import com.example.newworldadventure.ui.viewmodel.GameViewModel

class KompendiumAdapter(
    private val dataset: List<Any>,
    val viewModel: GameViewModel
) : RecyclerView.Adapter<ViewHolder>(){

    private  val floraUndFauna = 1
    private val materiale = 2
    private val armor = 3


    inner class floraUndFaunaViewHolder(val binding: KompendiumScreenFloraFaunaBinding): RecyclerView.ViewHolder(binding.root)
    inner class materialViewHolder(val binding: KompendiumScreenMaterialienBinding): RecyclerView.ViewHolder(binding.root)
    inner class armorViewHolder(val binding: KompendiumScreenWaffenRuestungSchmuckBinding): RecyclerView.ViewHolder(binding.root)


    override fun getItemViewType(position: Int): Int {
        val item = dataset[position]

        return when(item ){
            1 -> {floraUndFauna}
            2 -> {materiale}
            else -> {armor}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if(viewType == floraUndFauna){
            val binding = KompendiumScreenFloraFaunaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            floraUndFaunaViewHolder(binding)
        } else if (viewType == materiale){
            val binding = KompendiumScreenMaterialienBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            materialViewHolder(binding)
        }else {
            val binding = KompendiumScreenWaffenRuestungSchmuckBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            armorViewHolder(binding)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        val blume = viewModel.flora.value


        if(holder is floraUndFaunaViewHolder){
            holder.binding.ivFloraFauna.setImageResource()
            holder.binding.tvNameFloraFauna.text
            holder.binding.tvArtFloraFauna.text
            holder.binding.ivGiftNogift.setImageResource(
                if(){
                    ivGiftNogift.setImageResource(R.drawable.skull_giftig)
                }else if(){
                    ivGiftNogift.setImageResource(R.drawable.skull_ungiftig)
                }else if(){
                    ivGiftNogift.setImageResource(R.drawable.skull_enemie)
                }else{
                    ivGiftNogift.visibility = invisible
                }
            )
        }else if(holder is materialViewHolder){
            holder.binding.ivImageMaterial.setImageResource()
            holder.binding.tvNameMaterial.text
            holder.binding.tvArMaterial.text
            holder.binding.tvSeltenheitMaterial.text
        }else if(holder is armorViewHolder){
            holder.binding.ivImageArmor.setImageResource()
            holder.binding.tvNameArmor.text
            holder.binding.tvArtArmor.text
        }
    }


}








//        if(holder is VillianViewHolder){
//            holder.binding.tvVillianname.text = item.name
//            holder.binding.tvNameanti.text = item.realName
//        }else if(holder is HeroViewHolder){
//            holder.binding.tvHeroname.text = item.name
//            holder.binding.tvName.text = item.realName
//        }
//    }
//
//}