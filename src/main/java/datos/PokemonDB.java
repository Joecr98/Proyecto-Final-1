/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Pokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joe
 */
public class PokemonDB {
    private static final String SQL_SELECT = "select distinct * from test.pokemon where evolution_parent_pokemon_id < 1";

    public List<Pokemon> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pokemon pokemon = null;
        List<Pokemon> pokemons = new ArrayList<Pokemon>();

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                pokemon = new Pokemon(
                    rs.getString("id")+"",
                    rs.getString("name")+"",
                    rs.getString("forme_name")+"",
                    rs.getString("forme_base_pokemon_id")+"",
                    rs.getString("generation_id")+"",
                    rs.getString("evolution_chain_id")+"",
                    rs.getString("evolution_method_id")+"",
                    rs.getString("evolution_parameter")+"",
                    rs.getString("height")+"",
                    rs.getString("weight")+"",
                    rs.getString("species")+"",
                    rs.getString("color")+"",
                    rs.getString("pokemon_shape_id")+"",
                    rs.getString("habitat")+"",
                    rs.getString("gender_rate")+"",
                    rs.getString("capture_rate")+"",
                    rs.getString("base_experience")+"",
                    rs.getString("base_happiness")+"",
                    rs.getString("gen1_internal_id")+"",
                    rs.getString("is_baby")+"",
                    rs.getString("has_gen4_fem_sprite")+"",
                    rs.getString("has_gen4_fem_back_sprite")+""
                );     
                //System.out.println(pokemon.toString());
                pokemons.add(pokemon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(rs);
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return pokemons;
    }   
}
